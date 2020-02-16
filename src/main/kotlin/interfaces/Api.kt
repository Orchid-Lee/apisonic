package interfaces

import models.*
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("ping")
    suspend fun ping(
    ): Response<PingResponse>

    @GET("getLicense")
    suspend fun getLicense(
    ): Response<LicenseResponse>

    @GET("getNowPlaying")
    suspend fun getNowPlaying(
    ): Response<NowPlayingResponse>

    @GET("getArtists")
    suspend fun getArtists(
    ): Response<ArtistsResponse>

    @GET("getGenre")
    suspend fun getGenres(
    ): Response<GenreResponse>

    @GET("getArtist")
    suspend fun getArtist(
        @Query("id") id: String
    ): Response<ArtistResponse>

    @GET("getAlbum")
    suspend fun getAlbum(
        @Query("id") id: String
    ): Response<AlbumResponse>

    @GET("getSong")
    suspend fun getSong(
        @Query("id") id: String
    ): Response<SongResponse>

    @GET("getVideos")
    suspend fun getVideos(
    ): Response<VideosResponse>

    @GET("getVideoInfo")
    suspend fun getVideoInfo(
        @Query("id") id: String
    ): Response<VideoInfoResponse>

    @GET("getArtistInfo")
    suspend fun getArtistInfo(
        @Query("id") id: String,
        @Query("count") count: Int?,
        @Query("includeNotPresent") includeNotPresent: Boolean?
    ): Response<ArtistInfoResponse>

    @GET("getArtistInfo2")
    suspend fun getArtistInfo2(
        @Query("id") id: String,
        @Query("count") count: Int?,
        @Query("includeNotPresent") includeNotPresent: Boolean?
    ): Response<ArtistInfo2Response>

    @GET("getSimilarSongs")
    suspend fun getSimilarSongs(
        @Query("id") id: String,
        @Query("count") count: Int?
    ): Response<SimilarSongsResponse>

    @GET("getSimilarSongs2")
    suspend fun getSimilarSongs2(
        @Query("id") id: String,
        @Query("count") count: Int?
    ): Response<SimilarSongsResponse>

    @GET("getTopSongs")
    suspend fun getTopSongs(
        @Query("artist") artist: String,
        @Query("count") count: Int?
    ): Response<TopSongsResponse>

    @GET("getRandomSongs")
    fun getRandomSongs(
        @Query("size") size: Int?,
        @Query("genre") genre: String?,
        @Query("fromYear") fromYear: Int?,
        @Query("toYear") toYear: Int?,
        @Query("musicFolderId") musicFolderId: String?
    ): Response<RandomSongsResponse>

    fun getSongsByGenre(
        @Query("genre") genre: String,
        @Query("count") count: Int?,
        @Query("offset") offset: Int?,
        @Query("musicFolderId") musicFolderId: String?
    ): Response<SongsByGenreResponse>

    @GET("getMusicFolders")
    suspend fun getMusicFolders(
    ): Response<MusicFoldersResponse>

    @GET("getIndexes")
    suspend fun getIndexes(
        @Query("musicFolderId") musicFolderId: String?,
        @Query("ifModifiedSince") ifModifiedSince: Long?
    ): Response<IndexesResponse>

    @GET("getMusicDirectory")
    suspend fun getMusicDirectory(
        @Query("id") id: String
    ): Response<MusicDirectoryResponse>

    @GET("startScan")
    suspend fun startScan(
    ): Response<ScanStatusResponse>

    @GET("getScanStatus")
    suspend fun getScanStatus(
    ): Response<ScanStatusResponse>

    @GET("getAlbumList")
    suspend fun getAlbumList(
        @Query("type") type: String,
        @Query("size") size: Int?,
        @Query("offset") offset: Int?,
        @Query("fromYear") fromYear: Int?,
        @Query("toYear") toYear: Int?,
        @Query("genre") genre: String?,
        @Query("musicFolderId") musicFolderId: String?
    ): Response<AlbumListResponse>

    @GET("getAlbumList2")
    suspend fun getAlbumList2(
        @Query("type") type: String,
        @Query("size") size: Int?,
        @Query("offset") offset: Int?,
        @Query("fromYear") fromYear: Int?,
        @Query("toYear") toYear: Int?,
        @Query("genre") genre: String?,
        @Query("musicFolderId") musicFolderId: String?
    ): Response<AlbumList2Response>

    @GET("getStarred")
    suspend fun getStarred(
        @Query("musicFolderId") musicFolderId: String?
    ): Response<StarredResponse>


    @GET("getStarred2")
    suspend fun getStarred2(
        @Query("musicFolderId") musicFolderId: String?
    ): Response<Starred2Response>


}
