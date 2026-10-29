.class public final LS8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS8/b$a;,
        LS8/b$b;
    }
.end annotation


# static fields
.field public static final c:LS8/b$a;


# instance fields
.field private final a:LP8/B;

.field private final b:LP8/D;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LS8/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS8/b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LS8/b;->c:LS8/b$a;

    return-void
.end method

.method public constructor <init>(LP8/B;LP8/D;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS8/b;->a:LP8/B;

    iput-object p2, p0, LS8/b;->b:LP8/D;

    return-void
.end method


# virtual methods
.method public final a()LP8/D;
    .registers 1

    iget-object p0, p0, LS8/b;->b:LP8/D;

    return-object p0
.end method

.method public final b()LP8/B;
    .registers 1

    iget-object p0, p0, LS8/b;->a:LP8/B;

    return-object p0
.end method
