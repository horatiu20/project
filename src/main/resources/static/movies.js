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
        const rating = $('#modal-movie-rating').val();
        const poster1 = $('#modal-movie-poster1').val();
        const poster2 = $('#modal-movie-poster2').val();
        const poster3 = $('#modal-movie-poster3').val();
        const poster4 = $('#modal-movie-poster4').val();
        const trailer1 = $('#modal-movie-trailer1').val();
        const trailer2 = $('#modal-movie-trailer2').val();
        const posters = [];
            if(poster1 !== ''){
                posters.push(poster1);
            }
            if(poster2 !== ''){
                posters.push(poster2);
            }
            if(poster3 !== ''){
                posters.push(poster3);
            }
            if(poster4 !== ''){
                posters.push(poster4);
            }
        const trailers = [];
            if(trailer1 !== ''){
                trailers.push(trailer1);
            }
            if(trailer2 !== ''){
                trailers.push(trailer2);
            }

        fetch(`/api/movies/${movieToEdit}`, {
            method: 'PUT',
            body: JSON.stringify({
                name: name,
                year: year,
                description: description,
                rating: rating,
                posters: posters,
                trailers: trailers
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
        const rating = $('#modal-movie-rating').val();
        const poster1 = $('#modal-movie-poster1').val();
        const poster2 = $('#modal-movie-poster2').val();
        const poster3 = $('#modal-movie-poster3').val();
        const poster4 = $('#modal-movie-poster4').val();
        const trailer1 = $('#modal-movie-trailer1').val();
        const trailer2 = $('#modal-movie-trailer2').val();
        const posters = [];
            if(poster1 !== ''){
                posters.push(poster1);
            }
            if(poster2 !== ''){
                posters.push(poster2);
            }
            if(poster3 !== ''){
                posters.push(poster3);
            }
            if(poster4 !== ''){
                posters.push(poster4);
            }
        const trailers = [];
            if(trailer1 !== ''){
                trailers.push(trailer1);
            }
            if(trailer2 !== ''){
                trailers.push(trailer2);
            }

        fetch('/api/movies', {
            method: 'POST',
            body: JSON.stringify({
                name: name,
                year: year,
                description: description,
                rating: rating,
                posters: posters,
                trailers: trailers

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
        $('#modal-movie-rating').val('');
        $('#modal-movie-poster1').val('');
        $('#modal-movie-poster2').val('');
        $('#modal-movie-poster3').val('');
        $('#modal-movie-poster4').val('');
        $('#modal-movie-trailer1').val('');
        $('#modal-movie-trailer2').val('');
    }

    $('.delete-icon').click(function () {
        let confirm = window.confirm("Are you sure you want to delete the entry?");
        if (!confirm) {
            return false;
        }
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
        const rating = row.children[4].innerText;

        $('#modal-movie-name').val(name);
        $('#modal-movie-year').val(year);
        $('#modal-movie-description').val(description);
        $('#modal-movie-rating').val(rating);
        $('#modal-movie-poster1').val(poster.length > 0 ? poster[0].url : '');
        $('#modal-movie-poster2').val(poster.length > 1 ? poster[1].url : '');
        $('#modal-movie-poster3').val(poster.length > 2 ? poster[2].url : '');
        $('#modal-movie-poster4').val(poster.length > 3 ? poster[3].url : '');
        $('#modal-movie-trailer1').val(trailer.length > 0 ? trailer[0].url : '');
        $('#modal-movie-trailer2').val(trailer.length > 1 ? trailer[1].url : '');
    });

    $('#add-movie-main-button').click(() => {
        clearModal();
        movieToEdit = null
    });

    $(document).ready(function(){
    $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
         $("#mainTable tr").filter(function() {
        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
        });
    });

    $(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();
    });
});