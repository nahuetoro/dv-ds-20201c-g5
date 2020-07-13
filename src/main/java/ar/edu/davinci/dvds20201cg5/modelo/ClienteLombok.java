package ar.edu.davinci.dvds20201cg5.modelo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

@Data
//@ToString
//@EqualsAndHashCode
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteLombok {
	
	private Long id;
	private String name;
	private String lastName;
	private String email;
	private String password;

}
