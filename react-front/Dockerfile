#node.js
FROM node:18-alpine

#set working dir
WORKDIR /app

COPY package*.json ./

#Dependencies
RUN npm install

COPY . .

EXPOSE 3000

CMD ["npm", "start"]
