from flask import Blueprint, render_template, request, flash

auth = Blueprint('auth', __name__)

@auth.route('/login')
def login():
    return render_template("login.html", text = "Testing")

@auth.route('/logout')
def logout():
    return "<p>Logout</p>"

@auth.route('/signup', methods = ['GET', 'POST'])
def signup():
    if request.method == 'POST':
        email = request.form.get('fname')
        
        if len(email) < 4:
            flash('Email is not more than 4 characters.', category='error')
    return render_template("signup.html")