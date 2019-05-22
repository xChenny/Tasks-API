# Tasks-API
A Simple REST API made in Spring Framework.


| VERB   | ROUTE                   | DESCRIPTION                                                                   |
|--------|-------------------------|-------------------------------------------------------------------------------|
| GET    | /api/tasks              | Gets all tasks                                                                |
| GET    | /api/tasks/:id          | Gets one task                                                                 |
| POST   | /api/tasks              | Creates a task and returns it                                                 |
| PUT    | /api/tasks/:id          | Overwrite all fields of task with given id                                    |
| PATCH  | /api/tasks/:id          | Overwrites the diff of the request body and the task with the specified id    |
| DELETE | /api/tasks/:id          | Deletes the task with the given id                                            |
| POST   | /api/tasks/:id/comments | Add a comment to the task with the given id                                   |
| DELETE | /api/tasks/:id/:cid     | Delete the comment with given id, ":cid" on the task with the given id, ":id" |
