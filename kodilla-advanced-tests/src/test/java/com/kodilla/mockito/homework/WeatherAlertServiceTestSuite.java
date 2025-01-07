package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertServiceTestSuite {

    private WeatherAlertService weatherAlertService;
    private Client client;
    private Client secondClient;
    private Client thirdClient;
    private Location location;
    private Location secondLocation;
    private Location thirdLocation;
    private Notification notification;

    @BeforeEach
    void setup() {
        weatherAlertService = new WeatherAlertService();
        client = Mockito.mock(Client.class);
        secondClient = Mockito.mock(Client.class);
        thirdClient = Mockito.mock(Client.class);
        location = Mockito.mock(Location.class);
        secondLocation = Mockito.mock(Location.class);
        thirdLocation = Mockito.mock(Location.class);
        notification = Mockito.mock(Notification.class);
    }


    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        weatherAlertService.SendLocationNotfication(location, notification);
        weatherAlertService.SendGeneralNotfication(notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void ClientSubscribedToGivenLocationShouldReceiveGeneralNotificationAndLocationNotification() {
        weatherAlertService.SubscribeToLocation(client, location);

        weatherAlertService.SendLocationNotfication(location, notification);
        weatherAlertService.SendGeneralNotfication(notification);

        Mockito.verify(client, Mockito.times(2)).receive(notification);
    }

    @Test
    public void ClientUnsubscribedFromGivenLocationShouldReceiveGeneralNotificationButNotLocationNotification() {
        weatherAlertService.SubscribeToLocation(client, location);
        weatherAlertService.UnsubscribeFromGivenLocation(client, location);

        weatherAlertService.SendLocationNotfication(location, notification);
        weatherAlertService.SendGeneralNotfication(notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void ClientUnsubscribedFromAllLocationsShouldNotReceiveAnyNotification() {
        weatherAlertService.SubscribeToLocation(client, location);
        weatherAlertService.SubscribeToLocation(client, secondLocation);
        weatherAlertService.SubscribeToLocation(client, thirdLocation);
        weatherAlertService.UnsubscribeFromAllLocations(client);

        weatherAlertService.SendLocationNotfication(location, notification);
        weatherAlertService.SendLocationNotfication(secondLocation, notification);
        weatherAlertService.SendLocationNotfication(thirdLocation, notification);
        weatherAlertService.SendGeneralNotfication(notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void LocationNotificationShouldBeReceivedOnlyByClientsSubscribedToGivenLocation() {
        weatherAlertService.SubscribeToLocation(client, location);
        weatherAlertService.SubscribeToLocation(secondClient, secondLocation);
        weatherAlertService.SubscribeToLocation(thirdClient, thirdLocation);

        weatherAlertService.SendLocationNotfication(location, notification);
        weatherAlertService.SendLocationNotfication(secondLocation, notification);
        weatherAlertService.SendLocationNotfication(secondLocation, notification);
        weatherAlertService.SendLocationNotfication(thirdLocation, notification);
        weatherAlertService.SendLocationNotfication(thirdLocation, notification);
        weatherAlertService.SendLocationNotfication(thirdLocation, notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(2)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(3)).receive(notification);

    }

    @Test
    public void GeneralNotificationShouldBeReceivedByAllClientsSubscribedToAnyLocation() {
        weatherAlertService.SubscribeToLocation(client, location);
        weatherAlertService.SubscribeToLocation(secondClient, secondLocation);
        weatherAlertService.SubscribeToLocation(thirdClient, thirdLocation);

        weatherAlertService.SendGeneralNotfication(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);

    }

    @Test
    public void deletedLocationShouldNotReceiveAnyNotification() {
        weatherAlertService.SubscribeToLocation(client, location);
        weatherAlertService.SubscribeToLocation(secondClient, secondLocation);
        weatherAlertService.SubscribeToLocation(client, thirdLocation);

        weatherAlertService.deleteLocation(thirdLocation);
        weatherAlertService.SendGeneralNotfication(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
    }
}
