package org.delivery.db.userordermenu;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.delivery.db.BaseEntity;
import org.delivery.db.userordermenu.enums.UserOrderMenuStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Table(name = "user_order_menu")
@Entity
public class UserOrderMenuEntity extends BaseEntity {

	@Column(nullable = false)
	private Long userOrderId;

	@Column(nullable = false)
	private Long storeMenuId;

	@Enumerated(EnumType.STRING)
	@Column(length = 50, nullable = false)
	private UserOrderMenuStatus status;
}
