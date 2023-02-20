#!/bin/bash

# Store the current machine information in variables
hostname=$(hostname)
ip_address=$(hostname -I)
mac_address=$(ifconfig | grep -o -E '([[:xdigit:]]{1,2}:){5}[[:xdigit:]]{1,2}')

# Create a file to store the index of replicas 
touch index.txt 
echo "Hostname, IP Address, MAC Address" >> index.txt 
echo "$hostname, $ip_address, $mac_address" >> index.txt 
echo "" >> index.txt  # Add an empty line for readability 

 # Copy the script to a new file and execute it 
cp $0 new_replica.sh  # Copy the script to a new file 
chmod +x new_replica.sh # Make the new file executable 
./new_replica.sh & # Execute the new file in background
