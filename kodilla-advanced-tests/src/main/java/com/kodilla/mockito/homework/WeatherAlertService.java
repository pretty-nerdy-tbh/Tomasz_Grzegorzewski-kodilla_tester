package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WeatherAlertService {

    private HashMap<Location, Set<Client>> subscrbersAndLocations = new HashMap<>();

    public void SubscribeToLocation(Client client, Location location){
        if (this.subscrbersAndLocations.containsKey(location)){
            this.subscrbersAndLocations.get(location).add(client);
        } else {
            Set<Client> clients = new HashSet<>();
            clients.add(client);
            this.subscrbersAndLocations.put(location, clients);
        }
    }

    public void UnsubscribeFromGivenLocation(Client client, Location location){
        if (this.subscrbersAndLocations.containsKey(location)){
            this.subscrbersAndLocations.get(location).remove(client);
        } else {
            System.out.println("There is no such location in the database");
        }
    }

    public void UnsubscribeFromAllLocations(Client client){
        for(Map.Entry<Location, Set<Client>> locations : this.subscrbersAndLocations.entrySet()){
            if(locations.getValue().contains(client)){
                locations.getValue().remove(client);
            }
        }
    }

    public void SendLocationNotfication(Location location, Notification notification){
        if (this.subscrbersAndLocations.containsKey(location)) {
            subscrbersAndLocations.get(location).forEach(client -> client.receive(notification));
        } else {
            System.out.println("There is no such location in the database");
        }
    }

    public void SendGeneralNotfication(Notification notification){
        for(Map.Entry<Location, Set<Client>> locations : this.subscrbersAndLocations.entrySet()){
            locations.getValue().forEach(client -> client.receive(notification));
        }
    }

    public void deleteLocation (Location location){
        if (this.subscrbersAndLocations.containsKey(location)){
            this.subscrbersAndLocations.remove(location);
        } else {
            System.out.println("There is no such location in the database");
        }
    }
}
