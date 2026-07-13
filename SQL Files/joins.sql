use upgrad;

create table category(CategoryID int primary key,  CategoryName varchar(100), Description varchar(255));
create table products(ProductID int primary key, 
				ProductName varchar(100), 
                CategoryID int, 
                price int,
                foreign key (CategoryID) references category(CategoryID)
                );

INSERT INTO category (CategoryID, CategoryName, Description)
VALUES
(1, 'Beverages', 'Soft drinks, coffees, teas, beers, and ales'),
(2, 'Condiments', 'Sweet and savory sauces, relishes, spreads, and seasonings');


INSERT INTO Products (ProductID, ProductName, CategoryID, Price)
VALUES
(1, 'Chais', 1, 18),
(2, 'Chang', 1, 19),
(3, 'Aniseed Syrup', 2, 10);

                
select * from category;
select * from products;

-- Inner Join -- 
select ProductID, ProductName, CategoryName 
from Products 
inner join category on Products.CategoryID = category.CategoryID;

-- Right Join --
select ProductID, ProductName, CategoryName 
from Products 
right join category on Products.CategoryID = category.CategoryID;

-- Left Join --
select ProductID, ProductName, CategoryName 
from Products 
left join category on Products.CategoryID = category.CategoryID;

-- Cross Join --
select Products.ProductID, Products.ProductName, category.CategoryName 
from Products 
cross join category;

-- Cross Join -- 
SELECT Products.ProductID, Products.ProductName, category.CategoryName 
FROM Products 
FULL JOIN category ON Products.CategoryID = category.CategoryID; 


insert into category(CategoryID, CategoryName, Description) values (3, 'Electronics', 'Mouse, CPU, Monitor');
