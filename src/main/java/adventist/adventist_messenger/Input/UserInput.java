package adventist.adventist_messenger.Input;

import java.time.LocalDate;

// import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInput {
private String id;
private String firstName;
private String lastName;
private String middleName;
private int gender;
private String dateOfBirth;
private String phoneNumber;
private String email;
private String country;
private String region;
private String city;
private String zipCode;
private String division;
private String union;
private String conference;
private String station;
private String district;
private String congregation;
private String preferredLanguage;
private boolean hasParticipateInAdventistCommunity;
private boolean hasBaptized;
private boolean expectTobeBaptise;

}
