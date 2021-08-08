$(document).ready(()=>{
    let movieToEdit =null;

    $('#add-movie-button').click(()=>{
        if(movieToEdit){
            editMovie(movieToEdit);
        }else{
            addNew();
        }
    })

    function editMovie(movieToEdit){
        const name = $('#modal-movie-name').val();
        const year = $('#modal-movie-year').val();
        const description = $('#modal-movie-description').val();

        fetch(`/api/movies/${movieToEdit}`, {
            method: 'PUT',
            body: JSON.stringify({
                name: name,
                year: year,
                description: description
            }),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(response =>{
            if(response.ok){
                location.reload();
            }else{
                alert("There where errors " + response.status);
            }
        });
    }

    function addNew(){
        const name = $('#modal-movie-name').val();
        const year = $('#modal-movie-year').val();
        const description = $('#modal-movie-description').val();

        fetch('/api/movies', {
            method: 'POST',
            body: JSON.stringify({
                name: name,
                year: year,
                description: description
            }),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(response =>{
            if(response.ok){
                location.reload();
                clearModal();
            }else{
                alert("There where errors: " + response.status);
            }
        });
    }

    function clearModal(){
        $('#modal-movie-name').val('');
        $('#modal-movie-year').val('');
        $('#modal-movie-description').val('');
    }

    $('.delete-icon').click(function () {
        const movieId = this.parentElement.id;
        fetch(`/api/movies/${movieId}`, {
            method: 'DELETE'
        }).then(response => location.reload());
    });

    $('.edit-icon').click(function () {
        movieToEdit = this.parentElement.id;
        const row = this.parentElement.parentElement.parentElement;
        const name = row.children[1].innerText;
        const year = row.children[2].innerText;
        const description = row.children[3].innerText;

        $('#modal-movie-name').val(name);
        $('#modal-movie-year').val(year);
        $('#modal-movie-description').val(description);
    });

    $('#add-movie-main-button').click(() => {
        clearModal();
        movieToEdit = null
    });
});