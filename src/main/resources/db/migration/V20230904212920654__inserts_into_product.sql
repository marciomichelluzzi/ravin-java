INSERT INTO product
(
   name,
   description,
   code,
   cost_Price,
   sale_Price,
   preparation_Time,
   comments,
   product_Type,
   has_Active,
   created_By,
   created_Date
)
VALUES
(
   'Hamburger',
   'Delicious beef hamburger',
   'P001',
   5.00,
   10.00,
   '15 mins',
   'Best served
      hot',
   'SNACK',
   TRUE,
   'System',
   CURRENT_TIMESTAMP
),

(
   'Veggie Burger',
   'Plant-based burger',
   'P002',
   4.50,
   9.50,
   '12 mins',
   'Vegan-friendly',
   'SNACK',
   TRUE,
   'System',
   CURRENT_TIMESTAMP
),

(
   'Pasta Alfredo',
   'Creamy Alfredo pasta',
   'P003',
   6.50,
   13.00,
   '20 mins',
   NULL,
   'SNACK',
   TRUE,
   'System',
   CURRENT_TIMESTAMP
),

(
   'Caesar
      Salad',
   'Fresh salad with Caesar dressing',
   'P004',
   3.50,
   7.50,
   '10
      mins',
   NULL,
   'SNACK',
   TRUE,
   'System',
   CURRENT_TIMESTAMP
),

(
   'Tiramisu',
   'Classic Italian dessert',
   'P005',
   4.00,
   8.00,
   'NA',
   'Contains coffee',
   'DESSERT',
   TRUE,
   'System',
   CURRENT_TIMESTAMP
),

(
   'Margarita',
   'Classic tequila cocktail',
   'P006',
   6.00,
   12.00,
   '5 mins',
   'Contains
      alcohol',
   'DRINK',
   TRUE,
   'System',
   CURRENT_TIMESTAMP
),

(
   'Espresso',
   'Strong black coffee',
   'P007',
   1.50,
   3.00,
   '2 mins',
   'Caffeinated',
   'DRINK',
   TRUE,
   'System',
   CURRENT_TIMESTAMP
),

(
   'Orange
      Juice',
   'Freshly squeezed orange juice',
   'P008',
   2.00,
   4.50,
   'NA',
   'No
      added sugar',
   'DRINK',
   TRUE,
   'System',
   CURRENT_TIMESTAMP
),

(
   'Fried
      Chicken',
   'Crispy fried chicken',
   'P009',
   5.50,
   11.50,
   '20 mins',
   'Contains gluten',
   'SNACK',
   TRUE,
   'System',
   CURRENT_TIMESTAMP
),

(
   'Cheesecake',
   'Creamy cheesecake with berry topping',
   'P010',
   4.50,
   9.00,
   'NA',
   'Contains dairy',
   'DESSERT',
   TRUE,
   'System',
   CURRENT_TIMESTAMP
);