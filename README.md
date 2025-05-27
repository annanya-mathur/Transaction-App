Demo Transaction App for Spring Boot
# Propagation In Transaction
Transaction propagation defines how transactions relate to each other when multiple transactional methods are called. It determines whether a new transaction should be started or if an existing transaction should be joined. Here are the different propagation behaviors supported by Spring:

<ol>
<li><b>REQUIRED:- </b> This is the default propagation. If a transaction exists, the method will join it; otherwise, a new transaction will be created.</li>
<li>**REQUIRES_NEW:** Suspends the current transaction (if one exists) and creates a new one.</li>
<li>**SUPPORTS: ** Runs within a transaction if one exists; otherwise, it runs non-transactionally.</li>
<li>**NOT_SUPPORTED:** Runs the method non-transactionally and suspends any existing transaction.</li>
<li>**MANDATORY: ** Requires an existing transaction; throws an exception if none is present.</li>
<li>**NEVER:** Runs without a transaction; throws an exception if a transaction exists.</li>
<li>**NESTED: ** Runs within a nested transaction if one exists; otherwise, it starts a new transaction.</li>
</ol>

# USE CASE :-
<b>User placing an order</b>

<h1>Inventory DB</h1>
<h1>Order DB</h1>

<hr>
<h1>Steps to perform in Order Procession Service</h1>
Step 1:- get product inventory<br>
Step 2:- validate stock avaliability<br>
Step 3:- update total price in order entity
Step 4:- save order
Step 5:- update stock in inventory

