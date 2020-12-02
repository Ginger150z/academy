package hwRegExp.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    private String name;
    private Double money;
    private String dateOfBirth;
    private String number;
    private String email;

    public Person(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        Pattern pattern = Pattern.compile("\\d\\d[/-]\\d\\d[/-]\\d\\d\\d\\d");
        Matcher matcher = pattern.matcher(dateOfBirth);
        if (matcher.matches()) {
            this.dateOfBirth = dateOfBirth;
        } else {
            System.out.println("Wrong format date");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        Task_5_BelarusPhoneValidator validator = new Task_5_BelarusPhoneValidator();
        if (validator.isValid(number)) {
            this.number = number;
        } else {
            System.out.println("Wrong format number");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Task_5_EmailValidator validator = new Task_5_EmailValidator();
        if (validator.isValid(email)) {
            this.email = email;
        } else {
            System.out.println("Wrong format email");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
