.class public final LJ6/b;
.super Lg3/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/b$a;,
        LJ6/b$b;
    }
.end annotation


# static fields
.field public static final h:LJ6/b$b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LJ6/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ6/b$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LJ6/b;->h:LJ6/b$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V
    .registers 6

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpapers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lg3/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    return-void
.end method
