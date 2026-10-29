.class final LF8/w0;
.super LF8/C0;
.source "SourceFile"


# instance fields
.field private final u:Lv8/l;


# direct methods
.method public constructor <init>(Lv8/l;)V
    .registers 2

    invoke-direct {p0}, LF8/C0;-><init>()V

    iput-object p1, p0, LF8/w0;->u:Lv8/l;

    return-void
.end method


# virtual methods
.method public v()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public w(Ljava/lang/Throwable;)V
    .registers 2

    iget-object p0, p0, LF8/w0;->u:Lv8/l;

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
