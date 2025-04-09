package adventist.adventist_messenger.Modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;
import org.hibernate.annotations.UuidGenerator.Style;

import adventist.adventist_messenger.Input.UserInput;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users")
public class User {
@Id
@UuidGenerator(style = Style.AUTO)
private UUID id;
private String firstName;
private String lastName;
private String middleName;
private String gender;
private LocalDate dateOfBirth;
private String phoneNumber;
@Column(unique = true)
private String email;
private byte [] profilePicture;
private String country;
private String region;
private String city;
private String zipCode;
private String division;
@Column(name = "adventist_union")
private String union;
private String conference;
private String station;
private String district;
private String congregation;
private String preferredLanguage;
private boolean hasParticipateInAdventistCommunity;
private boolean hasBaptized;
private boolean expectTobeBaptise;
public User(UserInput  userInput) throws IOException {
    if(userInput.getId().length()!=0)
    this.id = UUID.fromString(userInput.getId());
    // if(userInput.getFirstName().equals(""))throw new RuntimeException("First name is required");
    this.firstName = userInput.getFirstName();
    // if(userInput.getLastName().equals(""))throw new RuntimeException("Last name is required");
    this.lastName = userInput.getLastName();
    this.middleName = userInput.getMiddleName();
    this.gender = userInput.getGender();
    this.preferredLanguage = userInput.getPreferredLanguage();
    this.zipCode = userInput.getZipCode();
    // format date from yyyy-mm-dd to LocalDate
    dateOfBirth = LocalDate.parse(userInput.getDateOfBirth());
 
    // if(userInput.getPhoneNumber().equals(""))throw new RuntimeException("Phone number is required");
    this.phoneNumber = userInput.getPhoneNumber();
    if(userInput.getEmail().equals("")) throw new RuntimeException("Email is required");
    if(!userInput.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new RuntimeException("Invalid email format");
    this.email = userInput.getEmail();
    // if(userInput.getCountry().equals(""))throw new RuntimeException("Country is required");
    this.country=userInput.getCountry();
    // if(userInput.getRegion().equals(""))throw new RuntimeException("Region is required");
    this.region=userInput.getRegion();
    // if(userInput.getCity().equals(""))throw new RuntimeException("City is required");
    this.city=userInput.getCity();
    // if(userInput.getDivision().equals(""))throw new RuntimeException("Division is required");
    this.division=userInput.getDivision();
    // if(userInput.getUnion().equals(""))throw new RuntimeException("Union is required");
    this.union=userInput.getUnion();
    // if(userInput.getConference().equals(""))throw new RuntimeException("Conference is required");
    this.conference=userInput.getCountry();
    // if(userInput.getStation().equals(""))throw new RuntimeException("Station is required");
    this.station=userInput.getStation();
    // if(userInput.getDistrict().equals(""))throw new RuntimeException("District is required");
    this.district=userInput.getDistrict();
    // if(userInput.getCongregation().equals(""))throw new RuntimeException("Country is required");
    this.congregation=userInput.getCongregation();
    // if(userInput.getPreferredLanguage().equals(""))throw new RuntimeException("Preffered language is required");
    this.country=userInput.getPreferredLanguage();
}

}
