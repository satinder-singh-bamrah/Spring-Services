# Spring-Services

Pre-requisite
    1. mongod running locally
    2. db name: Demo
    3. Collection: genre, artist, album, user

Make sure mongod up & runnig on defsult port 27017 before you start the spring service.

Services available:

MediaService:
    1. Get All Genre (get): /api/genre
    2. Create Genre (post): /api/genre
    3. Update Genre (put): /api/genre
    4. Delete Genre (delete): /api/genre
    5. Play Media (Get): api/media/play/<isbn>
        Request Header: user_id: value
    6. Get All Artist (get): /artist
    7. Get All Albums (get): /albums

UserService:
    1. Get users (get)
    2. Get user by id (get) /api/users/user/<userid> 
    3. isPremium (get) /api/users/user/ispremium
        Request Header: user_id: value
