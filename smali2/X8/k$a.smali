.class final LX8/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:[LX8/k$a;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 2
    new-array v0, v0, [LX8/k$a;

    iput-object v0, p0, LX8/k$a;->a:[LX8/k$a;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, LX8/k$a;->b:I

    .line 4
    iput v0, p0, LX8/k$a;->c:I

    return-void
.end method

.method public constructor <init>(II)V
    .registers 4

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, LX8/k$a;->a:[LX8/k$a;

    .line 7
    iput p1, p0, LX8/k$a;->b:I

    and-int/lit8 p1, p2, 0x7

    if-nez p1, :cond_e

    const/16 p1, 0x8

    .line 8
    :cond_e
    iput p1, p0, LX8/k$a;->c:I

    return-void
.end method


# virtual methods
.method public final a()[LX8/k$a;
    .registers 1

    iget-object p0, p0, LX8/k$a;->a:[LX8/k$a;

    return-object p0
.end method

.method public final b()I
    .registers 1

    iget p0, p0, LX8/k$a;->b:I

    return p0
.end method

.method public final c()I
    .registers 1

    iget p0, p0, LX8/k$a;->c:I

    return p0
.end method
