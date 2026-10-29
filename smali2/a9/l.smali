.class public final La9/l;
.super La9/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/l$a;
    }
.end annotation


# static fields
.field public static final j:La9/l$a;


# instance fields
.field private final h:Ljava/lang/Class;

.field private final i:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, La9/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La9/l$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, La9/l;->j:La9/l$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
    .registers 5

    const-string v0, "sslSocketClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sslSocketFactoryClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paramClass"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, La9/f;-><init>(Ljava/lang/Class;)V

    iput-object p2, p0, La9/l;->h:Ljava/lang/Class;

    iput-object p3, p0, La9/l;->i:Ljava/lang/Class;

    return-void
.end method
