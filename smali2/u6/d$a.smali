.class Lu6/d$a;
.super Lg1/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu6/d;-><init>(Lg1/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Lu6/d;Lg1/q;)V
    .registers 3

    invoke-direct {p0, p2}, Lg1/i;-><init>(Lg1/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .registers 1

    const-string p0, "INSERT OR ABORT INTO `wallpaper_request_index` (`_Id`,`subjectPromptId`,`stylePromptId`,`indexArray`,`totalCount`,`requestIndex`,`version`) VALUES (nullif(?, 0),?,?,?,?,?,?)"

    return-object p0
.end method

.method protected bridge synthetic i(Lo1/k;Ljava/lang/Object;)V
    .registers 3

    check-cast p2, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;

    invoke-virtual {p0, p1, p2}, Lu6/d$a;->k(Lo1/k;Lcom/nothing/wallpaper/db/WallpaperRequestIndex;)V

    return-void
.end method

.method protected k(Lo1/k;Lcom/nothing/wallpaper/db/WallpaperRequestIndex;)V
    .registers 5

    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->get_Id()I

    move-result p0

    int-to-long v0, p0

    const/4 p0, 0x1

    invoke-interface {p1, p0, v0, v1}, Lo1/i;->P(IJ)V

    const/4 p0, 0x2

    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getSubjectPromptId()J

    move-result-wide v0

    invoke-interface {p1, p0, v0, v1}, Lo1/i;->P(IJ)V

    const/4 p0, 0x3

    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getStylePromptId()J

    move-result-wide v0

    invoke-interface {p1, p0, v0, v1}, Lo1/i;->P(IJ)V

    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getIndexArray()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x4

    if-nez p0, :cond_24

    invoke-interface {p1, v0}, Lo1/i;->x0(I)V

    goto :goto_2b

    :cond_24
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getIndexArray()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Lo1/i;->r(ILjava/lang/String;)V

    :goto_2b
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getTotalCount()I

    move-result p0

    int-to-long v0, p0

    const/4 p0, 0x5

    invoke-interface {p1, p0, v0, v1}, Lo1/i;->P(IJ)V

    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getRequestIndex()I

    move-result p0

    int-to-long v0, p0

    const/4 p0, 0x6

    invoke-interface {p1, p0, v0, v1}, Lo1/i;->P(IJ)V

    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getVersion()I

    move-result p0

    int-to-long v0, p0

    const/4 p0, 0x7

    invoke-interface {p1, p0, v0, v1}, Lo1/i;->P(IJ)V

    return-void
.end method
