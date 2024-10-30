package Models;

import Enums.Status;
import Enums.Gender;
import java.util.ArrayList;

public class Character {
    private int id;
    private String name;
    private Status status;
    private Gender gender;
    private ArrayList<String> episodes;

    public Character(int id, String name, Status status, Gender gender, ArrayList<String> episodes) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.gender = gender;
        this.episodes = episodes;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ArrayList<String> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(ArrayList<String> episodes) {
        this.episodes = episodes;
    }
}
