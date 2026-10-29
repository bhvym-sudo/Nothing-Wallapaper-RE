.class public final LF6/a$b;
.super LE6/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF6/a$b$a;
    }
.end annotation


# static fields
.field public static final d:LF6/a$b$a;


# instance fields
.field private final c:F


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LF6/a$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF6/a$b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LF6/a$b;->d:LF6/a$b$a;

    return-void
.end method

.method private constructor <init>(FLC6/e;)V
    .registers 3

    .line 2
    invoke-direct {p0, p2}, LE6/a$a;-><init>(LC6/e;)V

    .line 3
    iput p1, p0, LF6/a$b;->c:F

    return-void
.end method

.method public synthetic constructor <init>(FLC6/e;Lkotlin/jvm/internal/h;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2}, LF6/a$b;-><init>(FLC6/e;)V

    return-void
.end method


# virtual methods
.method public final d()F
    .registers 1

    iget p0, p0, LF6/a$b;->c:F

    return p0
.end method
