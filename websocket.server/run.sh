./gradlew build
docker build --platform=linux/arm64 -t websocket .
docker tag websocket:latest 775448517459.dkr.ecr.us-east-1.amazonaws.com/websocket:latest
docker push 775448517459.dkr.ecr.us-east-1.amazonaws.com/websocket:latest
