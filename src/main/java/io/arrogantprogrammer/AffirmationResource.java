package io.arrogantprogrammer;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/affirmation")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AffirmationResource {

    List<Affirmation> affirmations = new ArrayList<>(){{
        add(new Affirmation("You are amazing!", "ArrogantProgrammer"));
        add(new Affirmation("Believe in yourself!", "ConfidentCoder"));
        add(new Affirmation("You can achieve anything!", "DiabolicalDeveloper"));
        add(new Affirmation("Stay positive and strong!", "HopefulHacker"));
        add(new Affirmation("Your potential is limitless!", "AngelicArchitect"));

    }};

    @GET
    public Affirmation getAffirmation() {
        return affirmations.get((int) (Math.random() * affirmations.size()));
    }
}
