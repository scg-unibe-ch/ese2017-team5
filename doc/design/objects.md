Driver: TODO

Tour:
  -> item_deliveries
  -> order_state
  - started_at
  - finished_at
  - estimate
  - duration
  - comment

Order:
  -> items
  - reference
  - destination_address

Item:
  -> item_state
  -> order
  - item
  - count
  - comment

ItemState:
  <- items
  - title
  - description
  - comment

  # (Initiated, InProgress, Completed, Rejected, Unavailable, Other)

OrderState:
  <- orders
  - title
  - description
  - comment

  # (Initiated, InProgress, Completed)

# TourState:
  <- tours
  - title
  - description
  - comment

  # (Initiated, InProgress, Completed)

ItemDelivery
  <- tour 
  -> item
  -> item_delivery_state

ItemDeliveryState:
  <- item_delivery

  # (Initiated, InProgress, Completed, Rejected, Unavailable, Other)

# Item

## Structure

| Attribute     | Type     | Required | Comment          |
| ------------- | -------- | -------- | ---------------- |
| name          | String   | y        | Item name        |
| count         | Int      | y        | Item count       |
| comment       | String   | n        | Optional comment |
| item_state    | Relation | y        | Item's state     |
| order         | Relation | y        | Item's order     |


# Order

## Structure

| Attribute     | Type     | Required | Comment          |
| ------------- | -------- | -------- | ---------------- |
| reference     | String   | y        | Order reference  |
| items         | Relation | y        | Order's items    |


# ItemDelivery

## Structure

| Attribute           | Type     | Required | Comment                        |
| ------------------- | -------- | -------- | ------------------------------ |
| tour                | relation | y        | Tour which delivery is part of |
| item                | relation | y        | Item to be delivered           |
| item_delivery_state | relation | y        | State of item delivery         |


# Tour

## Structure

| Attribute           | Type     | Required | Comment                         |
| ------------------- | -------- | -------- | ------------------------------- |
| started_at          | DateTime | n        | Timestamp when tour was started |
