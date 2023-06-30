select product_name
from netology.ORDERS
         join netology.CUSTOMERS c on c.id = orders.customer_id
where lower(c.name) = lower(:name);