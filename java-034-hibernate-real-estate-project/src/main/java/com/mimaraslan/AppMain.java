package com.mimaraslan;

import com.mimaraslan.dao.AgentDAO;
import com.mimaraslan.dao.BuyerDAO;
import com.mimaraslan.dao.PropertyDAO;
import com.mimaraslan.dao.SellerDAO;
import com.mimaraslan.model.Agent;
import com.mimaraslan.model.Buyer;
import com.mimaraslan.model.Property;
import com.mimaraslan.model.Seller;

import java.math.BigDecimal;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        AgentDAO agentDAO = new AgentDAO();
        BuyerDAO buyerDAO = new BuyerDAO();
        SellerDAO sellerDAO = new SellerDAO();
        PropertyDAO propertyDAO = new PropertyDAO();

        Agent agent1 = new Agent();
        agent1.setFirstName("Samet");
        agent1.setLastName("Furkan");
        agent1.setEmail("samet145312345@gmail.com");
        agent1.setPhone("123456789");
        agent1.setOfficeAddress("Ankara");
        agentDAO.saveOrUpdateAgent(agent1);

        Agent agent2 = new Agent();
        agent2.setFirstName("Veysel");
        agent2.setLastName("Ekinci");
        agent2.setEmail("v12345@gmail.com");
        agent2.setPhone("77655575776");
        agent2.setOfficeAddress("İzmir");
        agentDAO.saveOrUpdateAgent(agent2);


        Buyer buyer1 = new Buyer();
        buyer1.setFirstName("Selahattin");
        buyer1.setLastName("Dişli");
        buyer1.setEmail("sela9876@gmail.com");
        buyer1.setPhone("33333789");
        buyerDAO.saveOrUpdateBuyer(buyer1);

        Buyer buyer2 = new Buyer();
        buyer2.setFirstName("Zeynep");
        buyer2.setLastName("Coşkun");
        buyer2.setEmail("z1234@gmail.com");
        buyer2.setPhone("44444444");
        buyerDAO.saveOrUpdateBuyer(buyer2);


        Seller seller1 = new Seller();
        seller1.setFirstName("Muhammed");
        seller1.setLastName("Mammadov");
        seller1.setEmail("m1232525@gmail.com");
        seller1.setPhone("54645646");
        sellerDAO.saveOrUpdateSeller(seller1);

        Seller seller2 = new Seller();
        seller2.setFirstName("Sadık");
        seller2.setLastName("Kuzu");
        seller2.setEmail("sadik9999@gmail.com");
        seller2.setPhone("9987765");
        sellerDAO.saveOrUpdateSeller(seller2);


        Property property1 = new Property();
        property1.setPropertyName("Abc");
        property1.setTitle("Hotel");
        property1.setDescription("Turistlik belde");
        property1.setPrice(BigDecimal.valueOf(10_000_000));

        // ilişkiler
        property1.setAgent(agent1);
        property1.setSeller(seller1);
        property1.getBuyers().add(buyer1);
        property1.getBuyers().add(buyer2);
        property1.setType("Satılık");

        // SAVE INSERT CREATE
        propertyDAO.saveOrUpdateProperty(property1);


        property1.setType("Satıldı");
        propertyDAO.saveOrUpdateProperty(property1);



        Property property2 = new Property();
        property2.setPropertyName("Malikane");
        property2.setTitle("Dublex");
        property2.setDescription("Nezih bir konak");
        propertyDAO.saveOrUpdateProperty(property2);


        System.out.println("------------ agentList ---------------------------------");
        List<Agent> agentList  = agentDAO.getAgentFindAll();

        for (Agent agent : agentList) {
            System.out.println(agent.getFirstName() + " " + agent.getLastName());
        }

        System.out.println("------------ sellerList ---------------------------------");
        List<Seller> sellerList  = sellerDAO.getSellerFindAll();

        for (Seller seller : sellerList) {
            System.out.println(seller.getFirstName() + " " + seller.getLastName());
        }

        System.out.println("------------ buyerList ---------------------------------");
        List<Buyer> buyerList  = buyerDAO.getBuyerFindAll();

        for (Buyer buyer : buyerList) {
            System.out.println(buyer.getFirstName() + " " + buyer.getLastName());
        }

        System.out.println("------------ propertyList ---------------------------------");
        List<Property> propertyList  = propertyDAO.getPropertyFindAll();

        for (Property property : propertyList) {
            System.out.println(property.getId() + " " + property.getTitle() + " " + property.getDescription()
            + " " + property.getPrice()+ " " +

                    property.getAgent() + " " + property.getSeller());
        }



        System.out.println("DELETE----------- agentList ---------------------------------");

        agentDAO.deleteAgentFindById(2L);

        agentList  = agentDAO.getAgentFindAll();

        for (Agent agent : agentList) {
            System.out.println(agent.getFirstName() + " " + agent.getLastName());
        }

        System.out.println("FIND BY ID------------ buyer 1 ---------------------------------");

        Buyer buyerResult1  = buyerDAO.getBuyerFindById(1L);

        System.out.println(buyerResult1.getFirstName() + " " + buyerResult1.getLastName());


    }
}