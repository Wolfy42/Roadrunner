Readme.txt

Matthias Schmid
07.04.2011 

Um die mit nodejs simulierten sensoren zu starten müssen folgende Abhängigkeiten
installiert werden:

- git clone https://github.com/joyent/node.git && cd node
- ./configure
- make
- sudo make install
- sudo ./install_npm.sh
- sudo npm install optimist




Sensor starten mit:
node sensor.js --ip 172.16.102.224 --port 4711