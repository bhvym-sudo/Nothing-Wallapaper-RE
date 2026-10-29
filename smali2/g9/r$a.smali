.class final Lg9/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Lg9/h;


# direct methods
.method constructor <init>(Lg9/h;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/r$a;->a:Lg9/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, LP8/E;

    invoke-virtual {p0, p1}, Lg9/r$a;->b(LP8/E;)Ljava/util/Optional;

    move-result-object p0

    return-object p0
.end method

.method public b(LP8/E;)Ljava/util/Optional;
    .registers 2

    iget-object p0, p0, Lg9/r$a;->a:Lg9/h;

    invoke-interface {p0, p1}, Lg9/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p0

    return-object p0
.end method
