/**
 * Create time
 */
package shop.haj.mongo_repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import shop.haj.entity.Seller;

/**
 * Created by Hao on .
 * description。
 * @since 1.9.0
 */
public interface MongoSellerRpository extends MongoRepository<Seller,String> {
}
