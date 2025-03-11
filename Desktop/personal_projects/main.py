"""
- Online website application
- Date: 2/26/25

"""

from website import create_app

app = create_app()


if __name__ == '__main__':
    app.run(debug= True)