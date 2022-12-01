package College;
import org.springframework.data.jpa.repository.JpaRepository;

import College.Product;
public interface ProductRepository extends JpaRepository<Product, Integer>
{
}