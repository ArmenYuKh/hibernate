package com.ex.jdbcandhibernate.ex_001_jpa_crud;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientRepository cr = new ClientRepository();

        // добавление клиента
//        Client newClient = new Client();
//
//        newClient.setAge(55);
//        newClient.setName("Artur");
//        newClient.setPhone("(925)3234343");
//
//        cr.add(newClient);


//        List<Client> clients = cr.getAll();

//        for (Client client : clients) {
//            System.out.println(client.getId() + " " + client.getName() + " "
//                    + client.getAge() + " " + client.getPhone());
//        }

        // удаление клиента по id

//        Client clientGet = cr.getById(3);
//        System.out.println(clientGet.getId() + " " + clientGet.getName() + " "
//                + clientGet.getAge() + " " + clientGet.getPhone());
//
//        cr.remove(clientGet);


        // изменение данных клиента по id

//        Client client = cr.getById(4);
        Client client = new Client();

        client.setPhone("(929)111-11-11");

        cr.add(client);

    }
}
