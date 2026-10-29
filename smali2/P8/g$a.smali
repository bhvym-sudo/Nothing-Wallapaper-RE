.class public final LP8/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LP8/g$a;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()LP8/g;
    .registers 4

    new-instance v0, LP8/g;

    iget-object p0, p0, LP8/g$a;->a:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Li8/s;->w0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, LP8/g;-><init>(Ljava/util/Set;Lc9/c;ILkotlin/jvm/internal/h;)V

    return-object v0
.end method
