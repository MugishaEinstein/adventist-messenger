package adventist.adventist_messenger.Input;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInput {
private UUID id;
private String firstName;
private String lastName;
private String middleName;
private String gender;
private LocalDate dateOfBirth;
private String name;
private String email;
private String password;
private String phoneNumber;
private String address;
private MultipartFile profilePicture;
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
private LocalDate baptismExpectedDate;

}
