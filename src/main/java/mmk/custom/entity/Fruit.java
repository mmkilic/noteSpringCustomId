package mmk.custom.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mmk.custom.utility.CustomId;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fruit {
	
	@Id
	@CustomId(tableName = "fruit_custom_id")
	private int id;
	private String name;
	
}
