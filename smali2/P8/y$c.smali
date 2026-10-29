.class public final LP8/y$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/y$c$a;
    }
.end annotation


# static fields
.field public static final c:LP8/y$c$a;


# instance fields
.field private final a:LP8/u;

.field private final b:LP8/C;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LP8/y$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/y$c$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/y$c;->c:LP8/y$c$a;

    return-void
.end method

.method private constructor <init>(LP8/u;LP8/C;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LP8/y$c;->a:LP8/u;

    .line 4
    iput-object p2, p0, LP8/y$c;->b:LP8/C;

    return-void
.end method

.method public synthetic constructor <init>(LP8/u;LP8/C;Lkotlin/jvm/internal/h;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2}, LP8/y$c;-><init>(LP8/u;LP8/C;)V

    return-void
.end method


# virtual methods
.method public final a()LP8/C;
    .registers 1

    iget-object p0, p0, LP8/y$c;->b:LP8/C;

    return-object p0
.end method

.method public final b()LP8/u;
    .registers 1

    iget-object p0, p0, LP8/y$c;->a:LP8/u;

    return-object p0
.end method
