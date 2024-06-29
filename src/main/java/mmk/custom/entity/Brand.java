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
public class Brand {
	
	@Id
	@CustomId(tableName = "brand_custom_id", initialNum = 5000)
	private int id;
	private String name;
	
}
