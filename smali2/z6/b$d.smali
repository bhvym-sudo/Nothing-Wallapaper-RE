.class public final Lz6/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field private final q:Ljava/lang/String;

.field private final r:J

.field private final s:Ljava/util/List;

.field private final t:[J

.field private final u:Ljava/util/List;

.field final synthetic v:Lz6/b;


# direct methods
.method public constructor <init>(Lz6/b;Ljava/lang/String;JLjava/util/List;[JLjava/util/List;)V
    .registers 9

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sources"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lengths"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "files"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lz6/b$d;->v:Lz6/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz6/b$d;->q:Ljava/lang/String;

    iput-wide p3, p0, Lz6/b$d;->r:J

    iput-object p5, p0, Lz6/b$d;->s:Ljava/util/List;

    iput-object p6, p0, Lz6/b$d;->t:[J

    iput-object p7, p0, Lz6/b$d;->u:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(I)Le9/B;
    .registers 2

    iget-object p0, p0, Lz6/b$d;->s:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le9/B;

    return-object p0
.end method

.method public final b(I)Landroid/net/Uri;
    .registers 6

    iget-object p0, p0, Lz6/b$d;->u:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_1d

    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_1d

    invoke-static {p0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p0

    return-object p0

    :cond_1d
    const/4 p0, 0x0

    return-object p0
.end method

.method public close()V
    .registers 2

    iget-object p0, p0, Lz6/b$d;->s:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le9/B;

    invoke-static {v0}, LQ8/d;->m(Ljava/io/Closeable;)V

    goto :goto_6

    :cond_16
    return-void
.end method
