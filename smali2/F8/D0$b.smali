.class final LF8/D0$b;
.super LF8/C0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/D0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final u:LF8/D0;

.field private final v:LF8/D0$c;

.field private final w:LF8/t;

.field private final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LF8/D0;LF8/D0$c;LF8/t;Ljava/lang/Object;)V
    .registers 5

    invoke-direct {p0}, LF8/C0;-><init>()V

    iput-object p1, p0, LF8/D0$b;->u:LF8/D0;

    iput-object p2, p0, LF8/D0$b;->v:LF8/D0$c;

    iput-object p3, p0, LF8/D0$b;->w:LF8/t;

    iput-object p4, p0, LF8/D0$b;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public v()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public w(Ljava/lang/Throwable;)V
    .registers 4

    iget-object p1, p0, LF8/D0$b;->u:LF8/D0;

    iget-object v0, p0, LF8/D0$b;->v:LF8/D0$c;

    iget-object v1, p0, LF8/D0$b;->w:LF8/t;

    iget-object p0, p0, LF8/D0$b;->x:Ljava/lang/Object;

    invoke-static {p1, v0, v1, p0}, LF8/D0;->w(LF8/D0;LF8/D0$c;LF8/t;Ljava/lang/Object;)V

    return-void
.end method
