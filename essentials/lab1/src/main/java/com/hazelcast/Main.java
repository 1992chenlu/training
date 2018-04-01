package com.hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.Hazelcast;

public class Main {
    public static void main(String[] args) {
        Hazelcast.newHazelcastInstance();

        HazelcastClient.newHazelcastClient();
    }
}
