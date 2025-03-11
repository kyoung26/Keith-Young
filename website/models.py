from . import db
from flask_login import UserMixen




class User(db.Model, UserMixen):
    id = db.Column(db.Integer, primary_key=True)
    email = db.Column(db.string(255), unique = True)
    password = db.Column(db.String(255))
    first_name = db.Column(db.String(255))