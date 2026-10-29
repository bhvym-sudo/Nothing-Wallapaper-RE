.class public Lg9/m;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field private final q:I

.field private final r:Ljava/lang/String;

.field private final transient s:Lg9/x;


# direct methods
.method public constructor <init>(Lg9/x;)V
    .registers 3

    invoke-static {p1}, Lg9/m;->a(Lg9/x;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lg9/x;->b()I

    move-result v0

    iput v0, p0, Lg9/m;->q:I

    invoke-virtual {p1}, Lg9/x;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg9/m;->r:Ljava/lang/String;

    iput-object p1, p0, Lg9/m;->s:Lg9/x;

    return-void
.end method

.method private static a(Lg9/x;)Ljava/lang/String;
    .registers 3

    const-string v0, "response == null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HTTP "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lg9/x;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lg9/x;->e()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
