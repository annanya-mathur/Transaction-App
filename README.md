Demo Transaction App for Spring Boot
# Propagation In Transaction
Transaction propagation defines how transactions relate to each other when multiple transactional methods are called. It determines whether a new transaction should be started or if an existing transaction should be joined. Here are the different propagation behaviors supported by Spring:

<ol>
<li><b>REQUIRED:- </b> This is the default propagation. If a transaction exists, the method will join it; otherwise, a new transaction will be created.</li>
<li><b>REQUIRES_NEW:- </b> Suspends the current transaction (if one exists) and creates a new one.</li>
<li><b>SUPPORTS:- </b> Runs within a transaction if one exists; otherwise, it runs non-transactionally.</li>
<li><b>NOT_SUPPORTED:- </b> Runs the method non-transactionally and suspends any existing transaction.</li>
<li><b>MANDATORY:-</b> Requires an existing transaction; throws an exception if none is present.</li>
<li><b>NEVER:-</b> Runs without a transaction; throws an exception if a transaction exists.</li>
<li><b>NESTED:-</b> Runs within a nested transaction if one exists; otherwise, it starts a new transaction.</li>
</ol>

# Isolation In Transaction

# USE CASE :-
<b>User placing an order</b>

<h1>Inventory DB</h1>

| product id | product name | product price | stock quantity |
|------------|--------------|---------------|----------------|
| 1          | Laptop       | 25000         | 40             |
| 2          | SmartPhone   | 5000          | 5              |
| 3          | Watch        | 1500          | 50             |
| 4          | TV           | 75000         | 4              |


<hr>

<h1>Order DB</h1>
<h1>Audit Log DB</h1>

<hr>
<h1>Steps to perform in Order Procession Service</h1>
Step 1:- get product inventory<br>
Step 2:- validate stock avaliability<br>
Step 3:- update total price in order entity<br>
Step 4:- save order<br>
Step 5:- update stock in inventory

