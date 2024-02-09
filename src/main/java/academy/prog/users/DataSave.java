package academy.prog.users;

import java.util.concurrent.atomic.AtomicInteger;

public class DataSave {
    private String login;
    private String password;
    private AtomicInteger male;
    private AtomicInteger female;
    private AtomicInteger cat;
    private AtomicInteger dog;

    public DataSave() {
    }

    public DataSave(String login, String password) {
        this.login = login;
        this.password = password;
        male = new AtomicInteger(0);
        female = new AtomicInteger(0);
        cat = new AtomicInteger(0);
        dog = new AtomicInteger(0);
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public AtomicInteger getMale() {
        return male;
    }

    public void incrementMale() {
        male.incrementAndGet();
    }

    public AtomicInteger getFemale() {
        return female;
    }

    public void incrementFemale() {
        female.incrementAndGet();
    }

    public AtomicInteger getCat() {
        return cat;
    }

    public void setMale(AtomicInteger male) {
        this.male = male;
    }

    public void setFemale(AtomicInteger female) {
        this.female = female;
    }

    public void setCat(AtomicInteger cat) {
        this.cat = cat;
    }

    public void setDog(AtomicInteger dog) {
        this.dog = dog;
    }

    public void incrementCat() {
        cat.incrementAndGet();
    }

    public AtomicInteger getDog() {
        return dog;
    }

    public void incrementDog() {
        dog.incrementAndGet();
    }
}
