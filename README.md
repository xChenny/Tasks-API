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

```json
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

```json
{
  "id": uuid,
  "name": string,
  "comment": string
}
```

### An Example Task

```json
{
  "id": "956f8670-3bb3-460f-88cd-24ca7ee9091f",
  "title": "Make lab",
  "description": "Make the first lab for CS-554. Maybe talk about dinosaurs in it, or something",
  "hoursEstimated": 1,
  "completed": false,
  "comments": [
    {
        "id": "d0feb7c1-d4a8-4ca6-a8a7-2ed0a0189e28",
        "name": "Phil",
        "comment": "Considering lab about dinosaurs"
    },
    {
        "id": "3b4e3555-77d3-42af-ae38-03e463e95292",
        "name": "Jason",
        "comment": "Don't do dinosaurs..."
    },
    {
        "id": "294b9ef4-255b-4869-b6d1-105eece8add8",
        "name": "Phil",
        "comment": "Maybe make lab about REST?"
    },
    {
        "id": "8372caad-0ec2-477a-a496-1b64534759ec",
        "name": "Jason",
        "comment": "Definitely about REST."
    },
    {
        "id": "6f7098df-fede-45b5-9a20-5e85c107ada8,
        "name": "Phil",
        "comment": "Would dinosaurs agree with the idempotent standards of REST?"
    },
    {
        "id": "4db0a278-41aa-4e90-add8-2671b48cdb2b",
        "name": "Phil",
        "comment": "Do androids dream of electric velociraptors?"
    }
  ]
}
```
