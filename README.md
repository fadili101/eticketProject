"# eticketProject" 
"# eticketProject" 
"# eticketProject" 
<h1>Voici la collection de postman</h1>
<pre>
  {
	"info": {
		"_postman_id": "009034bc-4167-4c7a-8bc4-a6f84ef09c81",
		"name": "spring",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "27388961"
	},
	"item": [
		{
			"name": "addcaisse",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"CO_NO\": \"12345\",\r\n    \"nomUser\": \"Doe\",\r\n    \"prenomUser\": \"John\",\r\n    // ... autres champs de UserEntity ...\r\n    \"caisseId\": 2\r\n}\r\n",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/caisse/save",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"caisse",
						"save"
					]
				},
				"description": "tous"
			},
			"response": []
		},
		{
			"name": "getcaissebyid",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"CO_NO\": \"12345\",\r\n    \"nomUser\": \"Doe\",\r\n    \"prenomUser\": \"John\",\r\n    // ... autres champs de UserEntity ...\r\n    \"caisseId\": 2\r\n}\r\n",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/caisse/2",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"caisse",
						"2"
					]
				}
			},
			"response": []
		},
		{
			"name": "getallcaisses",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"CO_NO\": \"12345\",\r\n    \"nomUser\": \"Doe\",\r\n    \"prenomUser\": \"John\",\r\n    // ... autres champs de UserEntity ...\r\n    \"caisseId\": 2\r\n}\r\n",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/caisse/getCaisses",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"caisse",
						"getCaisses"
					]
				}
			},
			"response": []
		},
		{
			"name": "deletecaisse",
			"request": {
				"method": "DELETE",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"nomCaisse\": \"Caisse ND\",\r\n    \"descriptionCaisse\": \"Afric\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/caisse/delete/3",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"caisse",
						"delete",
						"3"
					]
				}
			},
			"response": []
		},
		{
			"name": "updatecaise",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"CO_NO\": \"12345\",\r\n    \"nomUser\": \"Doe\",\r\n    \"prenomUser\": \"John\",\r\n    // ... autres champs de UserEntity ...\r\n    \"caisseId\": 2\r\n}\r\n",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/caisss/update/2",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"caisss",
						"update",
						"2"
					]
				}
			},
			"response": []
		},
		{
			"name": "getallusers",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"nomCaisse\": \"Caisse ND\",\r\n    \"descriptionCaisse\": \"Afric\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/user/getUsers",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"user",
						"getUsers"
					]
				}
			},
			"response": []
		},
		{
			"name": "getallprofils",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"nomCaisse\": \"Caisse ND\",\r\n    \"descriptionCaisse\": \"Afric\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/user/2",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"user",
						"2"
					]
				}
			},
			"response": []
		},
		{
			"name": "adduser",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"CO_NO\": \"12345\",\r\n    \"nomUser\": \"Doe\",\r\n    \"prenomUser\": \"John\",\r\n    // ... autres champs de UserEntity ...\r\n    \"caisseId\": 2\r\n}\r\n",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/user",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"user"
					]
				}
			},
			"response": []
		},
		{
			"name": "getuserbyId",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"nomCaisse\": \"Caisse ND\",\r\n    \"descriptionCaisse\": \"Afric\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/user/3",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"user",
						"3"
					]
				}
			},
			"response": []
		},
		{
			"name": "deleteuser",
			"request": {
				"method": "DELETE",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"nomCaisse\": \"Caisse ND\",\r\n    \"descriptionCaisse\": \"Afric\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/user/delete/3",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"user",
						"delete",
						"3"
					]
				}
			},
			"response": []
		},
		{
			"name": "getalldepartements",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"nomCaisse\": \"Caisse ND\",\r\n    \"descriptionCaisse\": \"Afric\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api//departements/get/departements",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"",
						"departements",
						"get",
						"departements"
					]
				}
			},
			"response": []
		},
		{
			"name": "adddepartment",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"CO_NO\": \"12345\",\r\n    \"nomUser\": \"Doe\",\r\n    \"prenomUser\": \"John\",\r\n    // ... autres champs de UserEntity ...\r\n    \"caisseId\": 2\r\n}\r\n",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/caissed",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"caissed"
					]
				}
			},
			"response": []
		},
		{
			"name": "getprofilbyId",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"nomCaisse\": \"Caisse ND\",\r\n    \"descriptionCaisse\": \"Afric\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/profil/getProfil",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"profil",
						"getProfil"
					]
				}
			},
			"response": []
		},
		{
			"name": "addprofile",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"CO_NO\": \"12345\",\r\n    \"nomUser\": \"Doe\",\r\n    \"prenomUser\": \"John\",\r\n    // ... autres champs de UserEntity ...\r\n    \"caisseId\": 2\r\n}\r\n",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/caisses",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"caisses"
					]
				}
			},
			"response": []
		}
	]
}
</pre>
