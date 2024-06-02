# REAL ESTATE

## VERSION 1.0

MySQL
```
CREATE SCHEMA `real_estate_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
```

PostgreSQL
```
CREATE SCHEMA real_estate_db AUTHORIZATION postgres;
```


### Property - Mülk Varlık (Ev Arsa Dükkan)
- id
- propertyName
- title
- description
- type


---  Bir gayrimenkulu birden fazla kişi alabilir.
### Buyer - Alıcı
- id
- firstName
- lastName
- email
- phone

### Seller - Satıcı
- id
- firstName
- lastName
- email
- phone

### Agent - Emlakçı
- id
- firstName
- lastName
- email
- phone
- officeAddress

---

## VERSION 2.0
## Employee
## Address
## City
## Branch