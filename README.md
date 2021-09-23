## Spring JPA Project

#### API Routes

`GET /holdings` : Fetch all the holdings for a portfolio.

`GET /returns` : Fetch returns for a portfolio.

`POST /add` : Add a security entry.

`GET /trade` : Get the list of all trades.

`POST /trade` : Add a new trade.

`PUT /trade` : Update a existing trade with a new trade object.

`DELETE /trade/id` : Delete a trade with the corresponding id.

`GET /portfolio` : Get the resulting securities and trade with regard to the portfolio.

#### Object Representation

###### Trade

```java
public class Trade {
	// Primary Key in the database. Auto-Generated.
	private int id;
	// Whether the transaction is buy(1) or sell (0)
	private int type;
	// The price of transaction
	private int price;
	// The ticker of the company
	private String ticker;
	// Number of shares in the transaction,
	private int count;
}
```

##### Security Entry

```java
public class SecurityEntry {
    // Primary Key in the database.
	private int id;
    // The ticker of the company
	private String ticker;
    // Average Share Price.
	private double avg_price;
    // Number of shares.
	private int shares;
}
```

