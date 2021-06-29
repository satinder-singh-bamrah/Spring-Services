# Spring-Services

Pre-requisite
    1. mongod running locally
    2. db name: Demo
    3. Collection: genre, artist, album, user

Make sure mongod up & runnig on defsult port 27017 before you start the spring service.

Services available:
MediaService:
    1. Get All Genre (get): /genre
    2. Get All Artist (get): /artist
    3. Get All Albums (get): /albums

UserService:
    1. Get users (get)
    2. Get user by user_name (get) /user?username=gcamilla0 
    3. isPremium (get) /user/isPremium?id=38-823-9061
