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


## Schema

### A Task Item

```
{
  "id": uuid,
  "title": string,
  "description": string,
  "hoursEstimated": number,
  "completed": boolean,
  "comments": comment[]
}
```

### A Comment Item

```
{
  "id": uuid,
  "name": string,
  "comment": string
}
```

### An Example Task

```
{
  "id": "956f8670-3bb3-460f-88cd-24ca7ee9091f",
  "title": "Clean house",
  "description": "Clean the house before guests come over!!",
  "hoursEstimated": 4,
  "completed": false,
  "comments": [
    {
        "id": "d0feb7c1-d4a8-4ca6-a8a7-2ed0a0189e28",
        "name": "Jane Doe",
        "comment": "Don't forget this time!!!"
    }
  ]
}
```
